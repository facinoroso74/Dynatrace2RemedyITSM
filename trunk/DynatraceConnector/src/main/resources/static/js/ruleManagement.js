$(document).ready(function() {
	
	 if(!window.location.hash) {
	        window.location = window.location + '#loaded';
	        window.location.reload();
	    }
	
	var ragioniSociali = [];

	var ruleData = {
			ruleName : "",
			acronym : "",
			lastChangeTimestamp : "",
			creationUser : "",
			lastChangeUser : "",
			state : ""
	};

	var ruleStates = {
			"ENABLED" : "<span class='glyphicon glyphicon-one-fine-dot-green'></span>",
			"CONFIGURED" : "<span class='glyphicon glyphicon-one-fine-dot-gray'></span>",
			"DISABLED" : "<span class='glyphicon glyphicon-one-fine-dot-yellow'></span>",
			"MODIFIED" : "<span class='glyphicon glyphicon-one-fine-dot-gray'></span>"
	};
	
	var monthNum = {
			"Gen" : "01",
			"Feb" : "02",
			"Mar" : "03",
			"Apr" : "04",
			"Mag" : "05",
			"Giu" : "06",
			"Lug" : "07",
			"Ago" : "08",
			"Set" : "09",
			"Ott" : "10",
			"Nov" : "11",
			"Dic" : "12"
	};
	
	getRulesList();
	

	$('#dataTableRules').DataTable(
			
			{	
			
			   
				"pageLength": 20,
			
				"columnDefs" : [ {
					"orderable" : false,
					"className" : 'select-checkbox',
					"targets" : 0
				} ],
				"select" : {
					"style" : 'os',
					"selector" : 'td:first-child'
				},
				"order" : [ [ 4, 'desc' ] ],
				"lengthMenu" : [ [ 5, 10, 20, 50, -1 ],
					[ 5, 10, 20, 50, "All" ] ],
					"sort": [2]
			});
	/*
	 * $(document).on('click', '#delete', function(e) { $('tbody
	 * tr.selected').remove(); });
	 * 
	 * $(document) .on( 'click', '#enable', function(e) {
	 * $('tbody tr.selected') .find('[name="stato"]')
	 * .replaceWith( '<span class="glyphicon
	 * glyphicon-one-fine-dot-green"></span>');
	 * 
	 * });
	 * 
	 * $(document) .on( 'click', '#disable', function(e) {
	 * $('tbody tr.selected') .find('[name="stato"]')
	 * .replaceWith( '<span class="glyphicon
	 * glyphicon-one-fine-dot-yellow"></span>'); });
	 */
	
	function cercaAcronimi(){
		var idBean = {id:"",acronym:""};
		$.ajax({
			url: '/wrc/cercaAcronimi',
			dataType: "json",
			type: 'POST',
			contentType : 'application/json; charset=utf-8',
			data:JSON.stringify(idBean),
			success: function (data) {
				
				$.each(data, function(index, item) { 
					//console.log(item);
					ragioniSociali[item.acronimo]=item.ragioneSociale;
				})
				
			},
			error : function(xhr, textStatus, errorThrown ) {

				//gestione modale errori
//				console.log(xhr.responseText);
				$.LoadingOverlay("hide");
				$('#errmex').text('');
				$('#errmex').text(xhr.responseText);
				$('#modal-Error').modal('toggle');

			}

		});
		
	}
	
	function getRulesList() {
		$.LoadingOverlay("show");
		cercaAcronimi();
		
		$
		.ajax({
			url : '/wrc/getRulesList',
			cache: false,
			dataType : "json",
			success : function(data) {

				console.log(data);

				$('#rules').find('tbody').first()
				.empty();
				console.log("RANKS");
				$
				.each(
						data,
						function(index, item) {
							
							console.log(item);
							var lastDate = item.lastChangeTimestamp;
							var orderingDate = lastDate.split(" ")[2]+monthNum[lastDate.split(" ")[1]]+lastDate.split(" ")[0]+lastDate.split(" ")[3];
						
							
							$('#rules')
							.find(
									'tbody')
									.first()
									.append(
											$("<tr id='rowRule-"
													+ item.ruleName
													+ "'><td id='rule-"
													+ item.ruleName
													+ "'></td><td name='ruleName'>"
													+ item.ruleName
													+ "</td><td name='acronym'>"
													+ item.acronym
													+ "</td><td name='ragSociale'>"
													+ item.ragioneSociale
													+ "</td><td name='lastChangeTimestamp'><span hidden>"+orderingDate+"</span>"
													+ lastDate
													+ "</td><td name='creationUser'>"
													+ item.creationUser
													+ "</td><td name='lastChangeUser'>"
													+ item.lastChangeUser
													+ "</td><td name='state' value='"+ item.state + "'>"
													+ ruleStates[item.state]
													+ "</td>" 
													+ "</tr>"));



						});
				$("#rules").DataTable().destroy();
				$('#rules')
				.DataTable(
				       
						{	

						 
							"pageLength": 20,
							"columnDefs" : [ {
								"orderable" : false,
								"className" : 'select-checkbox',
								"targets" : 0
							} ],
							"select" : {
								"style" : 'os',
								"selector" : 'td:first-child'
							},
							"order" : [ [ 4,
								'desc' ] ],
								"lengthMenu" : [
									[ 5, 10,
										20,
										50,
										-1 ],
										[ 5, 10,
											20,
											50,
											"All" ] ]

						});


				$.LoadingOverlay("hide");

				$("#rules").css("display", "");

			},
			error : function(data) {
				console.log(data);

				$.LoadingOverlay("hide");

			}

		});
	}
	;

	$(document)
	.on(
			'click',
			'#enable',
			function(e) {
				populateRuleData();

				$
				.ajax({
					url : "/wrc/enable",
					type : 'POST',
					contentType : 'application/json; charset=utf-8',
					data : JSON
					.stringify(ruleData),
					success : function(data) {
						if (data === "ok") {
							$(
							'#modal-Enable-OK')
							.modal(
							'toggle');

							$(
							'tbody tr.selected')
							.find(
							'[name="stato"]')
							.replaceWith(
							'<span class="glyphicon glyphicon-one-fine-dot-green"></span>');
						} else {
							$(
									'#modal-Enable-KO')
									.modal(
									'toggle');
						}
					},
					error : function(data) {
						$('#modal-Enable-KO')
						.modal('toggle');
					}
				})
			});

	$(document)
	.on(
			'click',
			'#disable',
			function(e) {

				populateRuleData();

				$
				.ajax({
					url : "/wrc/disable",
					type : 'POST',
					contentType : 'application/json; charset=utf-8',
					data : JSON
					.stringify(ruleData),
					success : function(data) {
						if (data === "ok") {
							$(
							'#modal-Disable-OK')
							.modal(
							'toggle');

							$(
							'tbody tr.selected')
							.find(
							'[name="stato"]')
							.replaceWith(
							'<span class="glyphicon glyphicon-one-fine-dot-yellow"></span>');
						} else {
							$(
									'#modal-Disable-KO')
									.modal(
									'toggle');
						}
					},
					error : function(data) {
						$('#modal-Disable-KO')
						.modal('toggle');
					}
				})
			});

	$(document).on(
			'click',
			'#show',
			function(e) {

				populateRuleData();

				$.ajax({
					url : "/wrc/getDetail",
					type : 'POST',
					dataType: "json",
					contentType : 'application/json; charset=utf-8',
					data : JSON
					.stringify(ruleData),
					success : function(data) {
						console.log(JSON.stringify(data));
						populateDetail(data);
						$('#modal-detail').modal('toggle');
					},
					error : function(data) {
						console.log;
						$('#errmex').text('Si è verificato un errore, siamo spiacenti');
						$('#modal-Error').modal('toggle');
					}
				})



			});

	$(document)
	.on(
			'click',
			'#modify',
			function(e) {
				populateRuleData();

				if(ruleData.state == "ENABLED") {
					$('#modal-Message-Disabilitare').modal('toggle');

					return;
				}

				$
				.ajax({
					url : "/wrc/modifyRuleTrigger?modify=yes",
					type : 'POST',
					contentType : 'application/json; charset=utf-8',
					data : JSON
					.stringify(ruleData),
					success : function(data) {
						console
						.log("modifySuccess");
						window.location.href = "/wrc/trigger";
					},
					error : function(xhr,
							textStatus,
							errorThrown) {
						console.log(textStatus);
						$('#errmex').text('');
						$('#errmex').text(xhr.responseText);
						$('#modal-Error').modal('toggle');
					}
				});
			});

	$(document)
	.on(
			'click',
			'#delete',
			function(e) {

				populateRuleData();

				if( ruleData.state == "ENABLED") {

					console.log("Disabilitare la regola prima ");

					$('#modal-Message-Disabilitare').modal('toggle');
					return;
				}

				$
				.ajax({
					url : "/wrc/delete",
					type : 'POST',
					contentType : 'application/json; charset=utf-8',
					data : JSON
					.stringify(ruleData),
					success : function(data) {
						if (data === "ok") {
							$(
							'#modal-Delete-OK')
							.modal(
							'toggle');

							$(
							'tbody tr.selected')
							.remove();
						} else {
							$(
									'#modal-Delete-KO')
									.modal(
									'toggle');
						}
					},
					error : function(data) {
						$('#modal-Delete-KO')
						.modal('toggle');
					}
				})
			});







	$(document).on(
			'click',
			'.select-checkbox',
			function(e) {

				populateRuleData();

				var parentTag = $(this).parent().get(0);

				var sel = $(this).parent(".selected");

				var rowClass = $(parentTag).attr("class");

				if (rowClass.indexOf("selected") != -1) {

					$('#show').removeClass("disabled");
					$('#modify').removeClass("disabled");
					$('#delete').removeClass("disabled");

					if(ruleData.state == "ENABLED") {
						$('#enable').addClass('disabled');
						$('#disable').removeClass("disabled");
					} else {
						$('#enable').removeClass("disabled");
						$('#disable').addClass('disabled');
					}

				} else {
					$('#enable').addClass('disabled');
					$('#disable').addClass('disabled');
					$('#show').addClass('disabled');
					$('#modify').addClass('disabled');
					$('#delete').addClass('disabled');
				}


			});

	function populateRuleData() {

		ruleData.ruleName = $("#rules tr.selected").find('td[name*=ruleName]').text();

		ruleData.acronym = $("#rules tr.selected").find('td[name*=acronym]').text();

		ruleData.lastModifiedDate = $("#rules tr.selected").find('td[name*=lastChangeTimestamp]').text();

		ruleData.creationUser = $("#rules tr.selected").find('td[name*=creationUser]').text();

		ruleData.lastChangeUser = $("#rules tr.selected").find('td[name*=lastChangeUser]').text();

		ruleData.state = $("#rules tr.selected").find('td[name*=state]').attr("value");											

		console.log("" + ruleData.ruleName);
		console.log("" + ruleData.acronym);
		console.log("" + ruleData.lastModifiedDate);
		console.log("" + ruleData.creationUser);
		console.log("" + ruleData.lastChangeUser);
		console.log("" + ruleData.state);	
	}

	function formattaData(data) {
		var dateObj = new Date(data);

		var curr_date = dateObj.getDate();
		var curr_month = dateObj.getMonth();
		curr_month = curr_month + 1;
		var curr_year = dateObj.getFullYear();
		var curr_min = dateObj.getMinutes();
		var curr_hr= dateObj.getHours();
		var curr_sc= dateObj.getSeconds();
		if(curr_month.toString().length == 1)
			curr_month = '0' + curr_month;      
		if(curr_date.toString().length == 1)
			curr_date = '0' + curr_date;
		if(curr_hr.toString().length == 1)
			curr_hr = '0' + curr_hr;
		if(curr_min.toString().length == 1)
			curr_min = '0' + curr_min;

		var lastDate = curr_month+"/"+curr_date +"/"+curr_year+ " "+curr_hr+":"+curr_min+":"+curr_sc;

		return lastDate;
	}

	function populateDetail(data){
		$('#ruleName').text(data.ruleName);
		$('#acronym').text(data.acronym);
		$('#state').html(ruleStates[data.state]+" ("+data.state+")");
		$('#rank').text(data.action.rank);
		$('#ragioneSociale').text(ragioniSociali[data.acronym]);
		
		//dati trigger
		$('#severity').text(data.trigger.severity);
		$('#triggerOffice').text(data.trigger.triggerOffice);
		$('#alertGroup').text(data.trigger.alertGroup);
		$('#officeType').text(data.trigger.officeType);
		$('#triggerNodes').empty();
		$.each(data.trigger.triggerNodes.triggerNode,function(index, item) {
			$('#triggerNodes').append(item+"<br />");
		})

		//dati Condition
		if(data.condition.timeCondition !== null){
		$('#alertPersistence').text(data.condition.timeCondition.alertPersistence+ " min");
		$('#recoverAlertPreTimeline').text(data.condition.timeCondition.recoverAlertPreTimeline);
		}
		$('#weekTimelines').empty();
		if(data.condition.timeCondition!==null && data.condition.timeCondition.weekTimelines!== undefined){
			$.each(data.condition.timeCondition.weekTimelines.weekTimeline,function(index, item) {
				$('#weekTimelines').append(item.weekDay+" "+item.timeFrom+" - "+item.timeTo+"<br />");
			})
		}
		

		//dati Condition
		$('#openTicketEnabled').text(data.action.openTicketEnabled);
		$('#sendEmailEnabled').text(data.action.sendEmailEnabled);
		$('#sdf').text(data.action.sdf);
		$('#actionEmails').empty();
		if(data.action.actionEmails!== undefined && data.action.actionEmails!== null){
			$.each(data.action.actionEmails.actionEmail,function(index, item) {
				$('#actionEmails').append(item+"<br />");
			})
		}
		
		//dati exception		
		//if(data.exceptions.exception[0].exceptionNodes!==undefined && data.exceptions.exception.exceptionNodes!==null){
		$('#exceptionsDisp').empty();	
		if(data.exceptions.exception[0]!==undefined && data.exceptions.exception[0]!==null && data.exceptions.exception[0].exceptionNodes !==undefined && data.exceptions.exception[0].exceptionNodes !==null){
			
			$.each(data.exceptions.exception[0].exceptionNodes.exceptionNode,function(index, item) {
				exceptionDisplay='';
				if(item.exceptionOffice !== null && item.exceptionOffice !== undefined){
				//exceptionDisplay='Sede: '+item.exceptionOffice+', apparato: '+item.nodeName+' intervallo: '+item.exceptionDateFrom+'-'+item.exceptionDateTo;
					exceptionDisplay='Sede: '+item.exceptionOffice;
					if(item.nodeName !== null && item.nodeName !== undefined){
						exceptionDisplay=exceptionDisplay+', apparato: '+item.nodeName;
					}
					if(item.exceptionDateFrom !== null && item.exceptionDateFrom !== undefined && item.exceptionDateTo !== null && item.exceptionDateTo !== undefined){
						dataDaAnno = item.exceptionDateFrom.substring(0,4);
						dataDaMese = item.exceptionDateFrom.substring(4,6);
						dataDaDay = item.exceptionDateFrom.substring(6,8);
						dataDaHH= item.exceptionDateFrom.substring(8,10);
						dataDamm= item.exceptionDateFrom.substring(10,12);
						
						dataAAnno = item.exceptionDateTo.substring(0,4);
						dataAMese = item.exceptionDateTo.substring(4,6);
						dataADay = item.exceptionDateTo.substring(6,8);
						dataAHH= item.exceptionDateTo.substring(8,10);
						dataAmm= item.exceptionDateTo.substring(10,12);
						
						exceptionDisplay=exceptionDisplay+", intervallo: "+dataDaDay+'/ '+dataDaMese+'/ '+dataDaAnno+' '+dataDaHH+':'+dataDamm+' - '+dataADay+'/ '+dataAMese+'/ '+dataAAnno+' '+dataAHH+':'+dataAmm;
					}
				}else if(item.exceptionDateFrom !== null && item.exceptionDateFrom !== undefined && item.exceptionDateTo !== null && item.exceptionDateTo !== undefined){
					dataDaAnno = item.exceptionDateFrom.substring(0,4);
					dataDaMese = item.exceptionDateFrom.substring(4,6);
					dataDaDay = item.exceptionDateFrom.substring(6,8);
					dataDaHH= item.exceptionDateFrom.substring(8,10);
					dataDamm= item.exceptionDateFrom.substring(10,12);
					
					dataAAnno = item.exceptionDateTo.substring(0,4);
					dataAMese = item.exceptionDateTo.substring(4,6);
					dataADay = item.exceptionDateTo.substring(6,8);
					dataAHH= item.exceptionDateTo.substring(8,10);
					dataAmm= item.exceptionDateTo.substring(10,12);
					
					exceptionDisplay=exceptionDisplay+" Intervallo: "+dataDaDay+'/ '+dataDaMese+'/ '+dataDaAnno+' '+dataDaHH+':'+dataDamm+' - '+dataADay+'/ '+dataAMese+'/ '+dataAAnno+' '+dataAHH+':'+dataAmm;
				}
				$('#exceptionsDisp').append(exceptionDisplay+"<br/><br/>");
			})
		}else{
			$('#exceptionsDisp').append("Nessuna Eccezione Definita<br/>")
		}
		
		console.log(data);
		//dati Ipmaster
		$('#ipMasterEnabled').text(data.ipMaster.enable);
		$('#ipMasterEmailEnabled').text(data.ipMaster.notification.enabled);
		$('#ipMasterEmails').empty();
		$.each(data.ipMaster.notification.ipMasterConditionEmails.ipMasterConditionEmail,function(index, item) {
			$('#ipMasterEmails').append(item+"<br />");
		})
		
		$.each(data.ipMaster.ipMasterConditions.ipMasterCondition,function(index, item) {
			$('#ipMasterCS').append(item.cs+"<br />");
		})
	
	}
	
	 $(document).on('click', '#returnToRulMan', function(e) { window.location.reload(true) });
	
		
});

//window.onload = function() {
//    if(!window.location.hash) {
//        window.location = window.location + '#loaded';
//        window.location.reload();
//    }
//}