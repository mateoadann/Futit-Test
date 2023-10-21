//---1-----------------------------

var numberOfCalls = 0; 
        function calculateBinomial (a, b) { 
            var square0fA = a * a; 
            var square0fB = b * b;
            numberOfCalls++;
        
            return square0fA + square0fB + 2 * a * b;
        }
        console.log(calculateBinomial (2, 3)); 
        console.log(calculateBinomial (4, 5));
        console.log(numberOfCalls);
        console.log(typeof square0fA);

       //In this case, remove the HTML tags, but I understand that the first two "alert" would return 25, 82 respectively, 
        //then the third "alerts" would give 2 and the fourth "alertes" would get "undenifed" 
       //because in the case of html I understand the form of rendering is first all the html and then the <script> tag 
       //which causes the alert to be rendered before the squareOfA variable has a value, which would be "number"


//--2----------------------------------------------------------

const dataArray = ["Apple", "Orange", "Banana", "Strawberry", "Grape", "Mango", "Melon", "Pineapple", "Peach", "Peach"];


const stringsWithP = dataArray.filter(string => string.includes('p'));


console.log(stringsWithP);


const grapeString = dataArray.find(string => string === 'Grape');


console.log(grapeString);

//--3--------------------------------------------------------



const mostrar = (param) => { 
    param();
};

mostrar(() => {
    console.log("Etendo!!!");
    });

//-----4-----------------------------------------------------

function isDiagonalMatrix(matrix) {
    for (let i = 0; i < matrix.length; i++) {
      for (let j = 0; j < matrix[i].length; j++) {
        if (i !== j && matrix[i][j] !== 0) {
          return false;
        }
      }
    }
    return true;
  }
  

  
  const matrix = [[1, 0, 0], [0, 2, 0], [0, 0, 31]];
  
  const isDiagonal = isDiagonalMatrix(matrix);
  
  if (isDiagonal) {
    console.log("The matrix is a diagonal matrix.");
  } else {
    console.log("The matrix is not a diagonal matrix.");
  }
  