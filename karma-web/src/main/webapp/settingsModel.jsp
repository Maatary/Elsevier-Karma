<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="modal fade" id="modelSettingsDialog" tabindex="-1">
            <div class="modal-dialog">
                <form class="bs-example bs-example-form" role="form">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">Model Settings</h4>
                        </div>
                        <div class="modal-body">

                            <div class="form-group">
                                <label for="modelURI">Model URI</label>
                                <input class="form-control" type="text" id="modelURI"><br>     
                                <input  type="checkbox" id="ontologyType" >
                                <label style="font-weight: normal; margin-left: 5px;">
                                    Use Ontology type on mapping model
                                </label>
                                <br>
                                <div class="error"  style="display: none">Error: Please enter valid Model URI</div>
                            </div>
                        </div> <!-- /.modal-body -->
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal" id="btnCancel">Cancel</button>
                            <input type="button" class="btn btn-danger" value="Delete" id="btnDelete"/>
                            <input type="button" class="btn btn-primary" value="Submit" id="btnSave"/>
                        </div> <!-- /.modal-footer -->
                    </div><!-- /.modal-content -->
                </form>
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
    </body>
    <html>
