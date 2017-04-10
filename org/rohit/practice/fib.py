class fibonacci():
    
    def genFib(self,target):
        
        a,b = 0,1
        while b <=target:
            
            print(b, end=" ")
            a,b=b,a+b
            
                        
test = fibonacci() 
test.genFib(21)          
            
            