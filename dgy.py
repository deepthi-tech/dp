a=input()
b=len(a)
for i in range(0,b):
	if(a[i]=='0' or a[i]=='1'):
		c=1
	else:
		c=0
if(c==1):
	print("Yes")
else:
	print("No")
