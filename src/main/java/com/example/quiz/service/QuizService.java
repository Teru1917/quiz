package com.example.quiz.service;

import java.util.Optional;

import com.example.quiz.entity.Quiz;

/** Quizサービス処理：Service */
public interface QuizService {
	/** クイズ情報を全権取得 */
	Iterable<Quiz> selectAll();
	/** クイズ情報をidをキーに一件取得します */
	Optional<Quiz> selectOneById(Integer id);
	/** クイズ情報をランダムで一件取得する */
	Optional<Quiz> selectOneRandomQuiz();
	/** クイズの正解/不正解を判定する */
	Boolean checkQuiz(Integer id, Boolean myAnswer);
	/** クイズを登録する */
	void insertQuiz(Quiz quiz);
	/** クイズを更新する 
	 * @return */
	Quiz updateQuiz(Quiz quiz);
	/** クイズを削除する */
	void deleteQuizById(Integer id);
}
