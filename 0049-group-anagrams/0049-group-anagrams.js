/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let Smap=new Map();
for(const word of strs)
    {
        const sortedword=word.split('').sort().join('');
        
        if(Smap.has(sortedword))
            {
                Smap.get(sortedword).push(word);
            }
        else
            {
                Smap.set(sortedword,[word]);
            }
             
        
    }
    return Array.from(Smap.values());
};