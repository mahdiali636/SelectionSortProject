public class SelectionSort {
/** Creates a new instance of SelectionSort */
public SelectionSort() {
}
/* A simple SelectionSort algorithm
* pre-condition:
* post-condition:
* inputs:
* outputs:
* special conditions:
*/
public int[] basicSelectionSort(int[] x) {
for (int i = 0; i < x.length; ++i) {
for (int j= i+1; j < x.length; ++j) {
if (x[i] > x[j]) {
x[i] = x[j];
}
} // end of inner for loop
} // end of outer for loop
return x;
} // end of basicSelectionSort method
}
