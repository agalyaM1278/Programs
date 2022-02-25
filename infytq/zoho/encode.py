def encode(message):
    # Write your code here.
    currstr=""
    count=0
    res=""
    for i in message :
        if(i==currstr):
            count+=1
        else:
            if(count==0):
                currstr+=i
                count+=1
            else:
                k=currstr+str(count)
                res=res+k
                currstr=i
                count=1
    k=currstr+str(count)
    res=res+k
    return res