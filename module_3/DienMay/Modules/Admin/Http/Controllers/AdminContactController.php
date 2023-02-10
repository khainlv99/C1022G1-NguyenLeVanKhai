<?php

namespace Modules\Admin\Http\Controllers;

use App\Models\Contact;
use Illuminate\Http\Request;
use Illuminate\Http\Response;
use Illuminate\Routing\Controller;

class AdminContactController extends Controller
{
    /**
     * Display a listing of the resource.
     * @return Response
     */
    public function index(Request $request)
    {
        $lienhe = Contact::whereRaw(1);

        $lienhe = $lienhe->orderBy('id','DESC')->paginate(10);

        $viewData = [
            'lienhe' => $lienhe
        ];
        return view('admin::contact.index',$viewData);
    }

    public function action($action,$id)
    {
        $messages = '';
        if ($action) {
            $contact = Contact::find($id);
            switch ($action)
            {
                case 'delete':
                    $contact->delete();
                    $messages = 'Xóa dữ liệu thành công';
                    break;
            }
        }
        return redirect()->back()->with('success',$messages);
    }


}
