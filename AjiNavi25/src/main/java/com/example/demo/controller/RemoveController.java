package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entitiy.Review;
import com.example.demo.form.ReviewRemoveForm;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class RemoveController {	
	
//	レビュー削除リクエスト（一覧画面より）
	@PostMapping("/remove-review")
	public String removeReview(@Validated @ModelAttribute ReviewRemoveForm form, BindingResult result) {
		
		// エラーがあるときは例外を発生させる
		if(result.hasErrors()) {
			throw new IllegalArgumentException("**removeReview()**;");
		}
		
		return "confirm-remove-review";
	}
	
//	レビュー削除リクエスト（削除確認画面より）
	@PostMapping("/confirm-remove-review")
	public String confirmRemoveReview(
			@Validated ReviewRemoveForm form,
			BindingResult result,
			RedirectAttributes redirectAttributes) {
		
		// エラーがあるときは例外を発生させる
		if(result.hasErrors()) {
			throw new IllegalArgumentException("**removeReview()**;");
		}
		
		Review r = new Review();
		r.setReviewId(form.getReviewId());
		r.setRestaurantId(form.getRestaurantId());
		r.setUserId(form.getUserId());
		r.setVisitDate(form.getVisitDate());
		r.setRating(form.getRating());
		r.setComment(form.getComment());

//		暫定で表示
		System.out.println("ーーレビュー削除");
		System.out.println(r);
		
		
		redirectAttributes.addFlashAttribute("msg", "(レビュー削除)");
		return "redirect:/complete";
	}

}
