package akka.first.app.mapreduce.actors;


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import akka.actor.UntypedActor;
import akka.first.app.mapreduce.messages.*;

public class MapActor extends UntypedActor {
	
	private MapData evaluateExpression(String line) {
		List<WordCount> dataList =new ArrayList<WordCount>();
		StringTokenizer parser = new StringTokenizer(line);
		while(parser.hasMoreTokens()) {
			String word = parser.nextToken().toLowerCase();
			dataList.add(new WordCount(word,Integer.valueOf(1)));
		}
		return new MapData(dataList);
	}
	
	@Override
	public void onReceive(Object message) throws Exception {
		if(message instanceof String) {
			String work = (String) message;
			//map words and send to master
			getSender().tell(evaluateExpression(work));
		}
		else {
			unhandled(message);
		}
	}
	
	
}
