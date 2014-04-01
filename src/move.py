import os

for f in os.listdir('.'):
    if f.endswith('.class'):
        os.rename(f,'bak/'+f)
        print 'move %s to bak/%s' % (f,f)
        
