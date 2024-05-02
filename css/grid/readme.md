# CSS GRID

#### CSS grid layout is a brand new module that brings a twi-dimensional grid system to CSS for the first time.

#### CSS grid replaces float layouts, using less, and more readable and logic css and html.

#### CSS grid works perfectly together with flex, which is best to handle one dimensional component and layouts.

#### CSS grid completely changes the way that we envision and build two dimensional layouts.




### fr = fractional unit


# Explicit vs implicit grids

grids cells that we define using grid-template-rows/columns are explicit grids and the section of grid that
remains which gets automatically aligned down are implicit grids

properties of implicit grids:

grid-auto-rows:50px; //to give row size to implicit grids


implicit grids are by default aligned down(rows) but we can changes its position by

grid-auto-flow:col; //now remaining sections will be placed in col wise




## NOTE:

* justify: always means horizontal alignment or in x axis or row-axis
* align: always means vertical alignment or in y-axix or col-axis

* items(align-items/justify-items) means perticular item in grid
* content(align-content/justify-content) means whole grid item
    
    
    

## to fill the gaps automatically use dense using dense automatically cells will be placed inside the empty holes
    grid-auto-flow: row dense;



## min-content/ max-content / minmax()

* max-content:it will make the cell width with width of content inside it, and if there are more the items in cell it will just expand horizontally without making any line break

        grid-template-columns: max-content 1fr 1fr 1fr;

* min-content: it will resize the cell according to minimal content present in any cell 
    
        grid-template-columns: min-content 1fr 1fr min-content;
        grid-template-rows: repeat(2,min-content);


        width: 90%;
* minmax: rows should be atleast 150px high or min content to avoid overflow 
  
        grid-template-rows: repeat(2,minmax(150px,min-content));

        grid-template-columns: minmax(200px,300px) repeat(3,1fr);




## auto-fill and auto-fit


    grid-template-rows: repeat(2,minmax(150px,min-content)); 
    grid-template-rows: repeat(2,minmax(150px,min-content));
    width: 100%;

### auto-fill: creates tracks with desired width/size, to fill content inside container without need of mentioning number of column as it automatically checks how many columns can be created 
    grid-template-columns: repeat(auto-fill,minmax(150px,1fr));
    /* grid-template-columns: repeat(auto-fit,minmax(150px,1fr)); */


    /* justify-content: space-evenly; */
