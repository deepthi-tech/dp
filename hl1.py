n=int(input())
a=[]
x=input().split()
for i in x:
    a.append(int(i))
b=len(a)
j=0
k=0
t=0
for j in range(0,b):
    for k in range(j+1,b):
        if(a[j]>a[k]):
            t=a[j]
            a[j]=a[k]
            a[k]=t
print(a[0],a[b-1])
