a=[]
x=input().split()
for i in x:
    a.append(int(i))
b=len(a)
s=0
for j in range(0,b):
    s+=a[j]
c=s//b
print(c)
