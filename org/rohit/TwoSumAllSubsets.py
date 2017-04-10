class sumList():
    
    def sumSubset(self, l, sum1):
        
        s = set()
        finalList = []
        
        for x in l:
            
            result = []
            target = sum1-x
            if target not in s:
                
                s.add(x)
                
            else:
                
                result.extend([x,target])
                finalList.append(result)
                #finalList.extend(result) 
            
        return finalList
    
    
    
    
    
test = sumList()
a = [1,5,3,7,8,4,2,3]
print(test.sumSubset(a, 6))