The program checks to see if n is divisible by the for loop iterator i. If so, we add the appropriate values into the inner
array and then add the inner array into the outer array list as it is a array list of arrays.

I used a nested for loop, one for the initial found values and the inner loop is to divide the second value further if possible. For example, [2,8] is 
determined in the beginning of the initial loop, then the second loop is initiated to put [2,2,4] into another array to be added to the list as 
the 8 from [2,8] was divisible further.

I believe the run time and space complexity would be o(n^2) as I have a nested loop working in the function. 
Difficulties I encountered were figuring out how to automatically split values further after initially finding the factors of given numbers which I
ended up using a nested loop to do.  
