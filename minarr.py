n=int(input())
a=[]
x=0
max=0
for i in range(0,n):
    x=int(input())
    a.append(x)
    min=a[0]
for i in range(0,n):
    if(a[i]<min):
        min=a[i]
                
print(min)        
    
