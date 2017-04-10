class longestCommonPrefix():
    
    def commonPrefix(self, l):
        
        sz, ret = zip(*l), ""
        for c in sz:
            
            if len(set(c)) > 1: 
                
                break
            
            ret += c[0]
            
        return ret
    
test = longestCommonPrefix()
b = ["geeksforgeeks", "geeks", "geebeturn","geek"]
print(test.commonPrefix(b))