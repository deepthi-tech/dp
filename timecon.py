time=int(input())
mins=0
hours=time//60
if(time>60):
    mins=int(((time/60)-hours)*100)
if(mins>60):
    time=59
else:
    time=mins
print(hours,time)


