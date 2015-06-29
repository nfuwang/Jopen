//KVM host 图标URL
var host_KVM_img = "../resources/images/tree/rs_hst_kvm.png";
//Linux guest 图标URL
var guest_lin_img = "../resources/images/tree/rs_gst_lin.png";
//Windows guest 图标URL
var guest_win_img = "../resources/images/tree/rs_gst_win.png";

		
		var curMenu = null, zTree_Menu = null;
		var setting = {
			view: {
				showLine: false, 
				showIcon: this.isNotBlank,  //如果节点属性为blank，则不显示图标
				selectedMulti: false,
				dblClickExpand: false
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				onNodeCreated: this.onNodeCreated,
				beforeClick: this.beforeClick,
				onClick: this.onClick
			}
		};

		var zNodes =[
			{ id:1, pId:0, name:"系统信息", open:true},
			{ id:11, pId:1, name:"子菜单 1-1"},
			{ id:12, pId:1, name:"子菜单 1-2"},

			{id:13, pId:1, name:"", blank:true},
         	{id:14, pId:1, name:"", blank:true},
         	{id:15, pId:1, name:"", blank:true},
         	{id:16, pId:1, name:"", blank:true},
			{ id:2, pId:0, name:"虚拟机管理"},
			{ id:21, pId:2, name:"子菜单 2-1",open:true,icon:host_KVM_img},
			{ id:211, pId:21, name:"叶子节点 2-1-1"},
			{ id:212, pId:21, name:"叶子节点 2-1-2"},
			{ id:213, pId:21, name:"叶子节点 2-1-3"},
			{ id:214, pId:21, name:"叶子节点 2-1-4"},
			{ id:22, pId:2, name:"子菜单 2-2",open:true},
			{ id:221, pId:22, name:"叶子节点 2-2-1"},
			{ id:222, pId:22, name:"叶子节点 2-2-2"},
			{ id:223, pId:22, name:"叶子节点 2-2-3"},
			{ id:224, pId:22, name:"叶子节点 2-2-4"},
			{ id:3, pId:0, name:"系统管理"},
			{ id:31, pId:3, name:"子菜单 3-1"},
			{ id:311, pId:31, name:"叶子节点 3-1-1"},
			{ id:312, pId:31, name:"叶子节点 3-1-2"},
			{ id:313, pId:31, name:"叶子节点 3-1-3"},
			{ id:314, pId:31, name:"叶子节点 3-1-4"},
			{ id:32, pId:3, name:"子菜单 3-2"},
			{ id:321, pId:32, name:"叶子节点 3-2-1"},
			{ id:322, pId:32, name:"叶子节点 3-2-2"},
			{ id:323, pId:32, name:"叶子节点 3-2-3"},
			{ id:324, pId:32, name:"叶子节点 3-2-4"}			
		];

		function beforeClick(treeId, node) {
			if (node.isParent) {
				if (node.level === 0) {
					var pNode = curMenu;
					while (pNode && pNode.level !==0) {
						pNode = pNode.getParentNode();
					}
					if (pNode !== node) {
						var a = $("#" + pNode.tId + "_a");
						a.removeClass("cur");
						zTree_Menu.expandNode(pNode, false);
					}
					a = $("#" + node.tId + "_a");
					a.addClass("cur");

					var isOpen = false;
					for (var i=0,l=node.children.length; i<l; i++) {
						if(node.children[i].open) {
							isOpen = true;
							break;
						}
					}
					if (isOpen) {
						zTree_Menu.expandNode(node, true);
						curMenu = node;
					} else {
						zTree_Menu.expandNode(node.children[0].isParent?node.children[0]:node, true);
						curMenu = node.children[0];
					}
				} else {
					zTree_Menu.expandNode(node);
				}
			}
			//return !node.isParent &&  !node.blank && node.level != 0 ;
			return  !node.blank && node.level != 0 ;
		}
		function onClick(e, treeId, node) {
			alert(node.id);
		}
        
		function onNodeCreated(a, b, c) {
		/*	var d = $("#" + c.tId + "_a");
			//c.blank && alert(c.tId);
			c.blank && d.css({
				cursor: "default"
			});
			d.hover(function() {
				demoContent.curMenu != c && d.addClass("cur")
			}, function() {
				demoContent.curMenu != c && d.removeClass("cur")
			});*/
		}
			
		function isNotBlank(a, b) {
			return !b.blank
		}
		$(document).ready(function(){
			$.fn.zTree.init($("#meun_tree"), setting, zNodes);
			zTree_Menu = $.fn.zTree.getZTreeObj("meun_tree");
			curMenu = zTree_Menu.getNodes()[0].children[0];
			zTree_Menu.selectNode(curMenu);
			var a = $("#" + zTree_Menu.getNodes()[0].tId + "_a");
			a.addClass("cur");
		});