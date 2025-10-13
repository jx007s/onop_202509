// process, progress, program, proceed
console.log(`version : ${process.version}`) //node 버전
console.log(`arch : ${process.arch}`)
console.log(`platform : ${process.platform}`)
console.log(`pid : ${process.pid}`)
console.log(`uptime() : ${process.uptime()}`)
console.log(`execPath : ${process.execPath}`)  //C:\Program Files\nodejs\node.exe
console.log(`cwd() : ${process.cwd()}`)  //  D:\public\onop\2025_09\public\study\node_work\03_internal
console.log(`cpuUsage() : `, process.cpuUsage())  // { user: 31000, system: 46000 }
console.log(`env : `, process.env)