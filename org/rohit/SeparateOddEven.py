class separateOddEven():
    
    def separate(self, l):
        
        #odd = [];even = []
        even = [x for x in l if x%2==0]
        odd = [x for x in l if x%2!=0]
        #for x in l:
            
         #   if x%2 == 0:
                
          #      even.append(x)
                
         #   else:
                
          #      odd.append(x)
         
        k=0
        y=0
        length = len(l)//2
        l=[]        
        for x in range(length):
            
            l.insert(k,odd[y])
            l.insert(k+1,even[y])
            k+=2
            y+=1
            
        return l
    
test = separateOddEven()
a = [2,5,6,8,3,5,4,1]
print(test.separate(a))    