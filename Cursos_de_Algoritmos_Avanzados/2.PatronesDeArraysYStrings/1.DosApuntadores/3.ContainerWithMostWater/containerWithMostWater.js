/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    //two ponters at the beginning and at the end
    let p1 = 0;
    let p2 = height.length - 1;

    //max area variable
    let maxArea = 0;

    while(p1 < p2){
        //Calculate the area
         let area = Math.min(height[p1],height[p2]) * (p2-p1);

        //Check to store the area
        if(area > maxArea){
            maxArea = area;
        }

        //Move the pointer with minor number
        if(height[p1] > height[p2]){
            p2 -= 1;
        }else{
            p1 += 1;
        }
    }
    return maxArea;
};
