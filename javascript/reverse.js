function reverse(s){
    //let n = s.length;
    let rev ="";
    rev = s.split("").reverse().join(""); //reverse whole string
    rev = rev.split(" "); //split it
    rev = rev.reverse(); // reversing the string of word
    rev = rev.join(" "); //joining it again for desired result
    return rev;
}

s = "This is very nice day to play cricket";
console.log("Reversed string: "+reverse(s));