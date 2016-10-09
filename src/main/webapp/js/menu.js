/**
 Menu.js - модуль создания меню приложения
 */
menu = (function () {
    var setMenu, getMenu, appendLevel,
        menu_html = "";

    getMenu = function (inner_data, closed_flag) {
        $.each(inner_data, function (i, item) {
            appendLevel(item, closed_flag);
        });

        return menu_html;
    };

    appendLevel = function (item, closed_flag) {
        if (item.subMenu == null) {
            menu_html += "<div class='li-item x-closed'><a href='#'>" + item.name + "</a>";
        } else {
            menu_html += "<div class='li-level list-group-item";
            if (closed_flag)
                menu_html += " x-closed";
            else
                menu_html += "";
            menu_html += "'>" + item.name;
            $.each(item.subMenu, function (i, inner_item) {
                appendLevel(inner_item, true);
            });
        }
        menu_html += "</div>";
    };

    setMenu = function ($menu) {

        $.get("api/menu", function (response) {
            $menu.append(getMenu(response.data, false));
            $('.li-level').bind("click", function (event) {
                if ($(this).children('.li-item').hasClass('x-closed')) {
                    $(this).children('.li-item').fadeToggle(0).removeClass('x-closed').addClass('x-opened');
                } else {
                    $(this).children('.li-item').fadeToggle(0).removeClass('x-opened').addClass('x-closed');
                }

                if ($(this).children('.li-level').hasClass('x-closed')) {
                    $(this).children('.li-level').fadeToggle(0).removeClass('x-closed').addClass('x-opened');
                } else {
                    $(this).children('.li-level').fadeToggle(0).removeClass('x-opened').addClass('x-closed');
                }

                event.stopPropagation();
            });

            $('.li-item').bind("click", function (event) {
                //function handle href
                event.stopPropagation();
            });
        }, "json");

    };

    return {
        setMenu: setMenu
    };
}());