const singleton = require('./singleton')

let instance1 = singleton.getInstance()
let instance2 = singleton.getInstance()

console.log(instance1 === instance2)
