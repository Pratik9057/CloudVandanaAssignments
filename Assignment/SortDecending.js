function descendingSort(arr) {
    const len = arr.length;
    for (let i = 0; i < len - 1; i++) {
        for (let j = 0; j < len - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                const temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

const myArray = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];
const sortedArray = descendingSort(myArray);
console.log(sortedArray); 
