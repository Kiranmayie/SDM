<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Manage Client Records</title>
   


    <!-- Scripts -->

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src="bootstable.js" ></script>

    <!-- Styles -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.1.3/darkly/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
</head>
<body>
    <div id="jquery-script-menu">
<div class="jquery-script-center">


<h1>Create Modify and Delete Client records</h1>

</div>
<div class="jquery-script-clear"></div>
</div>
</div>
    <div id="app" style="margin:100px auto">

        <main class="py-4">
            <div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
                <div class="card-header">Manage Client Records</div>

                <div class="card-body">

        <button class="btn btn-primary" id="submit_data">Submit</button>
        <table class="table table-responsive-md table-sm table-bordered" id="makeEditable">
     <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Driver License </th>
        <th>Expiration Date </th>
		<th>Phone Num </th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Kiranmayie</td>
        <td>Bethi</td>
        <td>AASDFG1234</td>
        <td>31/12/2020</td>
        <td>4388665266</td>
      </tr>
      <tr class="success">
        <td>Sahana</td>
        <td>Shankar</td>
        <td>ZXCVB1234456</td>
        <td>01/01/2020</td>
        <td>9949977891</td>
      </tr>
     
    </tbody>
  </table>
        <span style="float:right"><button id="but_add" class="btn btn-danger">Add New Row</button></span>




                </div>
            </div>
        </div>
    </div>
</div>
        </main>
    </div>
</body>

<script>
    $(function() {

        $('#makeEditable').SetEditable({ $addButton: $('#but_add')});

        $('#submit_data').on('click',function() {
        var td = TableToCSV('makeEditable', ',');
        console.log(td);
        var ar_lines = td.split("\n");
        var each_data_value = [];
        for(i=0;i<ar_lines.length;i++)
        {
            each_data_value[i] = ar_lines[i].split(",");
        }

        for(i=0;i<each_data_value.length;i++)
        {
            if(each_data_value[i]>1)
            {
                console.log(each_data_value[i][2]);
                console.log(each_data_value[i].length);
            }

        }

});
    });

</script>
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-36251023-1']);
  _gaq.push(['_setDomainName', 'jqueryscript.net']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
</html>
