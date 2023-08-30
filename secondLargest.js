
const findSecondLargest = (arr) => {
    let largest = 0;
    let sLargest= 0;
    for(let num of arr){
        if(num > largest) largest = num;
        if(num > sLargest && num < largest) sLargest = num;
    }
    return sLargest;
}
const nums = [2, 5, 1, 6, 3, 9, 8];
let result = findSecondLargest(nums);

console.log(nums + "\n","Result", result);