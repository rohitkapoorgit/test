class tripletSumClosest():
    
    def tripletSumClosestTarget(self, l, target):
        
        smallest = l[0]+l[1]+l[len(l)-1]
        l.sort()
        for i in range(len(l)-2):
            
            j,k=i+1,len(l)-1
            if i>0 and l[i] == l[i-1]:
                continue
            
            while j<k:
                
                sum1 = l[i]+l[j]+l[k]
                if abs(sum1-target) < abs(smallest-target):
                    smallest = sum1
                   
                if sum1 >= target:
                    k-=1
                    
                if sum1 < target:
                    j+=1
                    
        return smallest
    
test = tripletSumClosest()
a = [-1,2,1,-4]
print(test.tripletSumClosestTarget(a, 1))
b = [-1,2,3,-4,3,3,-3,9]
print(test.tripletSumClosestTarget(b, 6))
