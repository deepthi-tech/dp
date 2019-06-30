hm1=[]
hm2=[]
h=0
m=0
a=input().split()
for i in a:
    hm1.append(int(i))
b=input().split()
for i in b:
    hm2.append(int(i))
if(hm1[0]>hm2[0]):
    h=hm1[0]-hm2[0]
else:
    h=hm2[0]-hm1[0]
if(hm1[1]>hm2[1]):
    m=hm1[1]-hm2[1]
else:
    m=hm2[1]-hm1[1]
print(h,m)
