/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length!=t.length)
        {
            return false;
        }
    
    const sorteds=s.split('').sort().join('');
    const sortedt=t.split('').sort().join('');
    
    if(sorteds==sortedt)
        {
            return true;
        }
    else
    {
        return false;
    }
};