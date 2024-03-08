/**
 * Licensed to MKS Group under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * MKS Group licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.sakaiproject.tool.imagedetector.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class InputBioController extends BaseController {
 
	/**
	 * Simply selects the home view to render by returning its name.
     * @return 
	 */
	@RequestMapping(value = {"/input-bio"}, method = RequestMethod.GET)
	public ModelAndView displayHome(HttpServletRequest request, HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("input-bio");

		return mav;
	}
	
	@PostMapping(value = "/save-bio")
	@ResponseBody
	public ResponseEntity<String> saveBio(@RequestParam("name") String name,
			@RequestParam("email") String email,
            @RequestParam("department") String department,
            @RequestParam("image") MultipartFile image) {
				return new ResponseEntity(name + " " + email + " " + department, HttpStatus.OK) ;
	}
	
//	@RequestMapping(value = "/save-bio", method=RequestMethod.POST)
//	@ResponseBody
//	public String saveBio(@RequestParam("name") String name,
//			@RequestParam("email") String email,
//            @RequestParam("department") String department,
//            @RequestParam("image") MultipartFile image) {
//				return name + " " + email + " " + department ;
//		
//	}
}

