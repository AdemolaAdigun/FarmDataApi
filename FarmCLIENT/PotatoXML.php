<!DOCTYPE HTML>
<html>
<head>
	<?php
	
//Validator

include "xsd/validator.php";
function libxml_display_errors() {
	$errors = libxml_get_errors();
	foreach ($errors as $error) {
		print libxml_display_error($error);
	}
	libxml_clear_errors();
}

// Enable user error handling

libxml_use_internal_errors(true);

$xml = new DOMDocument();
$xml->load('http://localhost:8080/cabbage.xml');

if (!$xml->schemaValidate('xsd/schema.xsd')) {
	print '<b>DOMDocument::schemaValidate() Generated Errors!</b>';
	libxml_display_errors();
} else {
	echo "<script>console.log('XML Validated!')</script>";

 ?>
<script>
window.onload = function() {

var dataPoints = [];

var chart = new CanvasJS.Chart("chartContainer", {
	animationEnabled: true,
	theme: "light2",
	title: {
		text: "Potato patch Temperatures"
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
	$(data).find("item").each(function () {
		var $dataPoint = $(this);
		var x = $dataPoint.find("date").text();
		var y = $dataPoint.find("temperature").text();
		dataPoints.push({x: parseFloat(x), y: parseFloat(y)});
	});

}

$.get("http://localhost:8080/potato.xml", addData);

}
</script>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
<a href="Potato.php"><p>Switch to JSON</p></a>
</body>
<?php
}
?>
</html>