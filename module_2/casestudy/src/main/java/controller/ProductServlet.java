package controller;

import model.Product;
import service.IProductService;
import service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/admin")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IProductService productService;

    public void init() {
        productService = new ProductService();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertUser(request, response);
                    break;
                case "edit":
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    break;
                case "edit":
                    break;
                case "delete":
                    break;
                default:
                    listUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void listUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Product> listProduct = productService.selectAllUsers();
        request.setAttribute("listProduct", listProduct);
        RequestDispatcher dispatcher = request.getRequestDispatcher("admin/list.jsp");
        dispatcher.forward(request, response);
    }
    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int idSP = request.getIntHeader("id_sp");
        String tenSP = request.getParameter("ten_sp");
        String donGia = request.getParameter("don_gia");
        String soLuong = request.getParameter("so_luong");
        String loaiSanPham = request.getParameter("id_lsp");
        Product newUser = new Product(idSP,tenSP,donGia,soLuong,loaiSanPham);
        productService.insertUser(newUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("admin/create.jsp");
        dispatcher.forward(request, response);
    }
}
