<!DOCTYPE HTML>
<html>
<head>
    <?php
    require_once 'vendor/autoload.php';
 
    use JsonSchema\Validator;
    use JsonSchema\Constraints\Constraint;

    $config = json_decode(file_get_contents('http://localhost:8080/cabbage.json'));
    $validator = new Validator; 
    $validator->validate(
    $config,
    (object)['$ref' => 'file://' . realpath('js/schema.json')],
    Constraint::CHECK_MODE_APPLY_DEFAULTS
    );

    if ($validator->isValid()) {
     echo "<h1>JSON</h1>";
     echo "<a href='Cabbage.php'> Cabbage <a><br>";
     echo "<a href='Potato.php'> Potato <a>";
     echo "<script>console.log('JSON Validated!')</script>";
 ?>
<script>
window.onload = function() {

var dataPoints = [];

var chart = new CanvasJS.Chart("chartContainer", {
	animationEnabled: true,
	theme: "light2",
	title: {
		text: "Sunflower patch Temperatures"
	},
	axisY: {
		title: "Degrees Celcius",
		titleFontSize: 24
	},
	data: [{
		type: "column",
		yValueFormatString: "#,### Units",
		dataPoints: dataPoints
	}]
});

function addData(data) {
	for (var i = 0; i < data.length; i++) {
		dataPoints.push({
			x: new Date(data[i].date),
			y: data[i].temperature
		});
	}
	chart.render();

}

$.getJSON("http://localhost:8080/sun.json", addData);

}
</script>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
<a href="SunflowerXML.php"><p>Switch to XML</p></a>
</body>
<?php
    }
?>
</html>