a=int(input())
b=int(input())
for n in range(a+1,b):
    s=0
    r=n
    while(n!=0):
        t=n%10
        n=n//10
        s=s+(t*t*t)
    if(r==s):
        print(r)
