// Reverse every word in the sentence
let input = "This is a sunny day";
let text = input.split(' ').map(word => word.split('').reverse().join('')).join(' ');
console.log(text);//output:sihT si a ynnus yad


