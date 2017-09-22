<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>Examples &middot; Bootstrap Table</title>
    <meta name="author" content="zhixin">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/jquery_table/jquery_table/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/jquery_table/jquery_table/src/bootstrap-table.css">
    <link rel="stylesheet" href="/jquery_table/jquery_table/docs/docs.css">

    <script src="/jquery_table/jquery_table/assets/jquery.min.js"></script>
    <script src="/jquery_table/jquery_table/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="/jquery_table/jquery_table/docs/examples.js"></script>
    <script src="/jquery_table/jquery_table/src/bootstrap-table.js"></script>
    <script src="/jquery_table/jquery_table/docs/docs.js"></script>
</head>
<body>
 <div>
                <div class="page-header">
                    <h1 id="pagination-table">Pagination Table</h1>
                </div>
                <div class="bs-example">
                    <table data-toggle="table" data-url="/jquery_table/jquery_table/docs/data2.json" data-height="246" data-pagination="true">
                        <thead>
                            <tr>
                                <th data-field="state" data-checkbox="true"></th>
                                <th data-field="id" data-align="right">Item ID</th>
                                <th data-field="name" data-align="center">Item Name</th>
                                <th data-field="price" data-align="">Item Price</th>
                            </tr>
                        </thead>
                    </table>
                </div>
            </div>
</body>
</html>