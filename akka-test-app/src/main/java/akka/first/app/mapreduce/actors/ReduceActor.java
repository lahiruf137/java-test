package akka.first.app.mapreduce.actors;



import java.util.HashMap;
import java.util.List;

import akka.actor.UntypedActor;
import akka.first.app.mapreduce.messages.*;

public class ReduceActor extends UntypedActor{
	
	
	
	
	public void onReceive(Object message) throws Exception{
		if (message instanceof MapData) {
			MapData mapData = (MapData) message;
			getSender().tell(reduce(mapData.getDataList()));
		}
		else {
			unhandled(message);
		}
	}
	
	
	private ReduceData reduce(List<WordCount> dataList) {
		HashMap<String, Integer> reduceMap= new HashMap<String, Integer>();
		for (WordCount wordCount : dataList) {
			if(reduceMap.containsKey(wordCount.getWord())) {
				Integer value=(Integer) reduceMap.get(wordCount.getWord());
				value++;
				reduceMap.put(wordCount.getWord(), value);
			}
			else {
				reduceMap.put(wordCount.getWord(), Integer.valueOf(1));
			}
		}
		return new ReduceData(reduceMap);
	}
	
}
