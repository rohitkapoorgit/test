
class Sort():

    def sortString(self, param):
        
        return ''.join(sorted(param))
    
    def sortListString(self, param):
        
        return sorted(param)
    
    def sortDict(self, param):
        
        for key in sorted(param):
            
            print(key, param[key])
            
        return sorted(param)
    
    def pallindrome(self, string):
        
        return string == string[::-1]
        
        
    
    
test = Sort()
print(test.sortString("rohit"))
print(test.sortListString(["bdq", "adc", "abc"]))
print(test.sortDict({'a':1, 'd':4, 'b':6}))
print(test.pallindrome("mada"))