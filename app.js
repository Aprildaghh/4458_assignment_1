const express = require('express')
const app = express()
const port = 5000


app.get("/hello", (req, res) => {
  res.status(200).send("hello");
})

app.get("/end", (req, res) => {
    res.status(200).send("Thank you for listening!");
})
  
app.listen(port, () => {
  console.log(`AWS app listening on port ${port}`);
})