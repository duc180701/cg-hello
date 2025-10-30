let i = 10;
let f = 20.5;
let b = true;
let s = 'Hà Nội';

let width = 20;
let height = 10;
let area = width * height;

let n1 = Number(prompt("A number input: "));
let n2 = Number(prompt("B number input: "));

if (n2 === 0) {
    alert("Không thể chia hết cho 0");
} else if (n1 % n2 === 0) {
    alert("A là bội số của B");
} else {
    alert("A không là bội số của B");
}

function showBai1() {
    document.getElementById("i").innerHTML = "i = " + i;
    document.getElementById("f").innerHTML = "f = " + f;
    document.getElementById("b").innerHTML = "b = " + b;
    document.getElementById("s").innerHTML = "s = " + s;
}

function showBai2() {
    document.getElementById("area").innerHTML = "width = " + width + "<br/>" + "height = " + height + "<br/>" + "area = " + width + " * " + height + " = " + area;
}

function sdtt() {
    let inputWidth = prompt("Enter input width: ");
    let inputHeight = prompt("Enter input height: ");

    let width = Number(inputWidth);
    let height = Number(inputHeight);

    document.getElementById("sdtt").innerHTML = "The area is: " + width * height;
}