m=0
m2=0
x=0
c=0
data=[]
for i in range(0,10):
    data.append([i,3*i,2*i,0.7])

alpha=0.005
for i in range(0,1000000):
    for cordinate in data:
        y=(m*cordinate[0])+(m2*cordinate[1])+c
        error=cordinate[2]-y
        m=m+(error*alpha*cordinate[0])
        m2=m2+(error*alpha*cordinate[1])
        c=c+(error*alpha)
    #print(m,c)

print(m,m2,c)