const express = require('express');
const app = express();

app.post('/save', async (req, res) => {
    res.send('Hey... Job is done....!')
});

app.listen(8191);