<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Manage Vehicle Records</title>
    
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


<h1>Create Modify and Delete Vehicle Records</h1>
<p></p>
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
                <div class="card-header">Manage Vehicle Records</div>

                <div class="card-body">

        <button class="btn btn-primary" id="submit_data">Submit</button>
        <table class="table table-responsive-md table-sm table-bordered" id="makeEditable">
     <thead>
      <tr>
        <th>Type</th>
        <th>Make</th>
        <th>Model </th>
        <th>Year</th>
		<th>Color</th>
		<th>LicensePlate</th>
		<th>Status</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>SUV</td>
        <td>Jeep</td>
        <td>Wrangler</td>
        <td>2019</td>
        <td>Black</td>
        <td>XCB 468</td>
        <td>Available</td>
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

  /*
  Bootstable
   @description  Javascript library to make HMTL tables editable, using Bootstrap
   @version 1.1
   @autor Tito Hinostroza
  */
    "use strict";
    //Global variables
    var params = null;  		//Parameters
    var colsEdi =null;
    var newColHtml = '<div class="btn-group pull-right">'+
  '<button id="bEdit" type="button" class="btn btn-sm btn-default"  onclick="rowEdit(this);">' +
  '<i class="fas fa-pencil-alt"></i>'+
  '</button>'+
  '<button id="bElim" type="button" class="btn btn-sm btn-default"  onclick="rowElim(this);">' +
  '<i class="fas fa-trash" aria-hidden="true"></i>'+
  '</button>'+
  '<button id="bAcep" type="button" class="btn btn-sm btn-default"  style="display:none;" onclick="rowAcep(this);">' + 
  '<i class="fas fa-check"></i>'+
  '</button>'+
  '<button id="bCanc" type="button" class="btn btn-sm btn-default" style="display:none;"  onclick="rowCancel(this);">' + 
  '<i class="fas fa-times" aria-hidden="true"></i>'+
  '</button>'+
      '</div>';

       var saveColHtml = '<div class="btn-group pull-right">'+
  '<button id="bEdit" type="button" class="btn btn-sm btn-default" style="display:none;" onclick="rowEdit(this);">' +
  '<i class="fas fa-pencil-alt"></i>'+
  '</button>'+
  '<button id="bElim" type="button" class="btn btn-sm btn-default" style="display:none;" onclick="rowElim(this);">' +
  '<i class="fas fa-trash" aria-hidden="true"></i>'+
  '</button>'+
  '<button id="bAcep" type="button" class="btn btn-sm btn-default"   onclick="rowAcep(this);">' + 
  '<i class="fas fa-check"></i>'+
  '</button>'+
  '<button id="bCanc" type="button" class="btn btn-sm btn-default"  onclick="rowCancel(this);">' + 
  '<i class="fas fa-times" aria-hidden="true"></i>'+
  '</button>'+
      '</div>';
    var colEdicHtml = '<td name="buttons">'+newColHtml+'</td>'; 
  var colSaveHtml = '<td name="buttons">'+saveColHtml+'</td>';
      
    $.fn.SetEditable = function (options) {
      var defaults = {
          columnsEd: null,         //Index to editable columns. If null all td editables. Ex.: "1,2,3,4,5"
          $addButton: null,        //Jquery object of "Add" button
          onEdit: function() {},   //Called after edition
  		onBeforeDelete: function() {}, //Called before deletion
          onDelete: function() {}, //Called after deletion
          onAdd: function() {}     //Called when added a new row
      };
      params = $.extend(defaults, options);
      this.find('thead tr').append('<th name="buttons"></th>');  //encabezado vacío
      this.find('tbody tr').append(colEdicHtml);
  	var $tabedi = this;   //Read reference to the current table, to resolve "this" here.
      //Process "addButton" parameter
      if (params.$addButton != null) {
          //Se proporcionó parámetro
          params.$addButton.click(function() {
              rowAddNew($tabedi.attr("id"));
          });
      }
      //Process "columnsEd" parameter
      if (params.columnsEd != null) {
          //Extract felds
          colsEdi = params.columnsEd.split(',');
      }
    };
  function IterarCamposEdit($cols, tarea) {
  //Itera por los campos editables de una fila
      var n = 0;
      $cols.each(function() {
          n++;
          if ($(this).attr('name')=='buttons') return;  //excluye columna de botones
          if (!EsEditable(n-1)) return;   //noe s campo editable
          tarea($(this));
      });
      
      function EsEditable(idx) {
      //Indica si la columna pasada está configurada para ser editable
          if (colsEdi==null) {  //no se definió
              return true;  //todas son editable
          } else {  //hay filtro de campos
  //alert('verificando: ' + idx);
              for (var i = 0; i < colsEdi.length; i++) {
                if (idx == colsEdi[i]) return true;
              }
              return false;  //no se encontró
          }
      }
  }
  function FijModoNormal(but) {
      $(but).parent().find('#bAcep').hide();
      $(but).parent().find('#bCanc').hide();
      $(but).parent().find('#bEdit').show();
      $(but).parent().find('#bElim').show();
      var $row = $(but).parents('tr');  //accede a la fila
      $row.attr('id', '');  //quita marca
  }
  function FijModoEdit(but) {

      $(but).parent().find('#bAcep').show();
      $(but).parent().find('#bCanc').show();
      $(but).parent().find('#bEdit').hide();
      $(but).parent().find('#bElim').hide();
      var $row = $(but).parents('tr');  //accede a la fila
      $row.attr('id', 'editing');  //indica que está en edición
  }
  function ModoEdicion($row) {
      if ($row.attr('id')=='editing') {
          return true;
      } else {
          return false;
      }
  }
  function rowAcep(but) {
  //Acepta los cambios de la edición
      
      
      var $row = $(but).parents('tr');  //accede a la fila
      var $cols = $row.find('td');  //lee campos
      if (!ModoEdicion($row)) return;  //Ya está en edición
      //Está en edición. Hay que finalizar la edición
      IterarCamposEdit($cols, function($td) {  //itera por la columnas
        var cont = $td.find('input').val(); //lee contenido del input
        $td.html(cont);  //fija contenido y elimina controles
      });
      FijModoNormal(but);
      params.onEdit($row);
  }
  function rowCancel(but) {
  //Rechaza los cambios de la edición
      var $row = $(but).parents('tr');  //accede a la fila
      var $cols = $row.find('td');  //lee campos
      if (!ModoEdicion($row)) return;  //Ya está en edición
      //Está en edición. Hay que finalizar la edición
      IterarCamposEdit($cols, function($td) {  //itera por la columnas
          var cont = $td.find('div').html(); //lee contenido del div
          $td.html(cont);  //fija contenido y elimina controles
      });
      FijModoNormal(but);
  }
  function rowEdit(but) {  
      var $td = $("tr[id='editing'] td");
      rowAcep($td)
      var $row = $(but).parents('tr');  
      var $cols = $row.find('td');  
      if (ModoEdicion($row)) return;  //Ya está en edición
      //Pone en modo de edición
      IterarCamposEdit($cols, function($td) {  //itera por la columnas
          var cont = $td.html(); //lee contenido
          var div = '<div style="display: none;">' + cont + '</div>';  //guarda contenido
          var input = '<input class="form-control input-sm"  value="' + cont + '">';
          $td.html(div + input);  //fija contenido
      });
      FijModoEdit(but);
  }
  function rowElim(but) {  //Elimina la fila actual
      var $row = $(but).parents('tr');  //accede a la fila
      params.onBeforeDelete($row);
      $row.remove();
      params.onDelete();
  }
  function rowAddNew(tabId) {  //Agrega fila a la tabla indicada.
  var $tab_en_edic = $("#" + tabId);  //Table to edit
      var $filas = $tab_en_edic.find('tbody tr');
      if ($filas.length==0) {
          //No hay filas de datos. Hay que crearlas completas
          var $row = $tab_en_edic.find('thead tr');  //encabezado
          var $cols = $row.find('th');  //lee campos
          //construye html
          var htmlDat = '';
          $cols.each(function() {
              if ($(this).attr('name')=='buttons') {
                  //Es columna de botones
                  htmlDat = htmlDat + colEdicHtml;  //agrega botones
              } else {
                  htmlDat = htmlDat + '<td></td>';
              }
          });
          $tab_en_edic.find('tbody').append('<tr>'+htmlDat+'</tr>');
      } else {
          //Hay otras filas, podemos clonar la última fila, para copiar los botones
          var $ultFila = $tab_en_edic.find('tr:last');
          $ultFila.clone().appendTo($ultFila.parent()); 
          $tab_en_edic.find('tr:last').attr('id','editing'); 
          $ultFila = $tab_en_edic.find('tr:last');
          var $cols = $ultFila.find('td');  //lee campos
          
          $cols.each(function() {
              if ($(this).attr('name')=='buttons') {
                  //Es columna de botones
              } else {
                  var div = '<div style="display: none;"></div>';  //guarda contenido
                  var input = '<input class="form-control input-sm"  value="">';

                  $(this).html(div + input);  //limpia contenido
              }
          });
           $ultFila.find('td:last').html(saveColHtml);

      }
  	params.onAdd();
  }
  function TableToCSV(tabId, separator) {  //Convierte tabla a CSV
      var datFil = '';
      var tmp = '';
  	var $tab_en_edic = $("#" + tabId);  //Table source
      $tab_en_edic.find('tbody tr').each(function() {
          //Termina la edición si es que existe
          if (ModoEdicion($(this))) {
              $(this).find('#bAcep').click();  //acepta edición
          }
          var $cols = $(this).find('td');  //lee campos
          datFil = '';
          $cols.each(function() {
              if ($(this).attr('name')=='buttons') {
                  //Es columna de botones
              } else {
                  datFil = datFil + $(this).html() + separator;
              }
          });
          if (datFil!='') {
              datFil = datFil.substr(0, datFil.length-separator.length); 
          }
          tmp = tmp + datFil + '\n';
      });
      return tmp;
  }

</script>
</html>
