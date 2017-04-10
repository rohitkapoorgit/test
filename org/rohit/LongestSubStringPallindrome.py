class longestSubStringPallindrome():
    
    def longestSubPallindrome(self, s):
        
        longestPall = ""
        for i in range(len(s)-1):
            
            for j in range(i+1, len(s)):
                
                if self.pallindrome(s[i:j]) and len(s[i:j]) > len(longestPall):
                    
                    longestPall = s[i:j]
                    
        return longestPall
                
                
            
    
    def pallindrome(self, sub):
        
        return sub == sub[::-1]
    
test = longestSubStringPallindrome()
print(test.longestSubPallindrome('HYABCDEFFEDCBADEDCBAGHTFYW1234554321ZWETYGDE'))
            
           
              