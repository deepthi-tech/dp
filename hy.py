n1=int(input())
a=0
for i in range(2,n1):
	if(n1%i==0):
		a=1
		break
	else:
		a=0
if(a==1):
	print("no")
else:
	print("yes")
