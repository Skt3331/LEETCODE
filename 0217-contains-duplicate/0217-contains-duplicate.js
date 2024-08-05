/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let unic =new Set()
    for(let a of nums)
        {
            if(unic.has(a))
                {
                    return true;
                }
           
            unic.add(a)
        }
    return false;
};