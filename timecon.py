time=int(input())
mins=0
hours=time//60
if(time>60):
    mins=(time/60)-hours
    time=int(mins)
if(mins>0.60):
    time=int(mins*60)
print(hours,time)


