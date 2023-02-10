
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="{{asset('theme_admin/New/vendor/bootstrap/css/bootstrap.min.css')}}">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="{{asset('theme_admin/New/vendor/font-awesome/css/font-awesome.min.css')}}">
    <!-- Fontastic Custom icon font-->
    <link rel="stylesheet" href="{{asset('theme_admin/New/css/fontastic.css')}}">
    <!-- Google fonts - Roboto -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
    <!-- jQuery Circle-->
    <link rel="stylesheet" href="{{asset('theme_admin/New/css/grasp_mobile_progress_circle-1.0.0.min.css')}}">
    <!-- Custom Scrollbar-->
    <link rel="stylesheet" href="{{asset('theme_admin/New/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css')}}">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="{{asset('theme_admin/New/css/style.default.css')}}" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="{{asset('theme_admin/New/css/custom.css')}}">
<!------ Include the above in your HEAD tag ---------->

<div class="page login-page">
      <div class="container">
        <div class="form-outer text-center d-flex align-items-center">
          <div class="form-inner">
          <div class="logo text-uppercase"><span>Admin</span><strong class="text-primary">Belong PhiLongElectric</strong></div>
            <div class="panel-body" >

                <form action="" class="form-horizontal" enctype="multipart/form-data" method="POST">
                    @csrf
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input id="user" required type="email" class="form-control" name="email" value="" placeholder="Email">
                    </div>

                    <div class="input-group" style="margin: 15px 0;">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                        <input id="password" required type="password" class="form-control" name="password" placeholder="Password">
                    </div>

                    <div class="form-group">
                        <!-- Button -->
                        <div class="col-sm-12 controls">
                            <button type="submit" href="#" class="btn btn-primary pull-right"><i class="glyphicon glyphicon-log-in"></i>Đăng nhập</button>
                        </div>
                    </div>

                </form>

            </div>
        </div>
    </div>
</div>
<script src="{{asset('theme_admin/New/vendor/jquery/jquery.min.js')}}"></script>
    <script src="{{asset('theme_admin/New/vendor/popper.js/umd/popper.min.js')}}"> </script>
    <script src="{{asset('theme_admin/New/vendor/bootstrap/js/bootstrap.min.js')}}"></script>
    <script src="{{asset('theme_admin/New/js/grasp_mobile_progress_circle-1.0.0.min.js')}}"></script>
    <script src="{{asset('theme_admin/New/vendor/jquery.cookie/jquery.cookie.js')}}"> </script>
    <script src="{{asset('theme_admin/New/vendor/chart.js/Chart.min.js')}}"></script>
    <script src="{{asset('theme_admin/New/vendor/jquery-validation/jquery.validate.min.js')}}"></script>
    <script src="{{asset('theme_admin/New/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js')}}"></script>
    <!-- Main File-->
    <script src="{{asset('theme_admin/New/js/front.js')}}"></script>
<div id="pbaiviet"></div>
