

/* First created by JCasGen Wed Sep 11 21:09:06 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** the annotation for answer
 * Updated by JCasGen Wed Sep 11 23:10:34 EDT 2013
 * XML source: /home/houcy/git/hw1-chenyinh/hw1-chenyinh/src/main/resources/hw1-chenyinh-typesystem.xml
 * @generated */
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets indicate where the answer was originally made by
   * @generated */
  public String getCasProcessorId() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "model.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets indicate where the answer was originally made by 
   * @generated */
  public void setCasProcessorId(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "model.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets indicate how confidence the answer is
   * @generated */
  public float getConfidence() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.Answer");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets indicate how confidence the answer is 
   * @generated */
  public void setConfidence(float v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.Answer");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: isCorrect

  /** getter for isCorrect - gets indicate whether the answer is correct
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "model.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets indicate whether the answer is correct 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "model.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: scoreList

  /** getter for scoreList - gets recored the score made by different authors
   * @generated */
  public FSArray getScoreList() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_scoreList == null)
      jcasType.jcas.throwFeatMissing("scoreList", "model.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_scoreList)));}
    
  /** setter for scoreList - sets recored the score made by different authors 
   * @generated */
  public void setScoreList(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_scoreList == null)
      jcasType.jcas.throwFeatMissing("scoreList", "model.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_scoreList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for scoreList - gets an indexed value - recored the score made by different authors
   * @generated */
  public Score getScoreList(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_scoreList == null)
      jcasType.jcas.throwFeatMissing("scoreList", "model.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_scoreList), i);
    return (Score)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_scoreList), i)));}

  /** indexed setter for scoreList - sets an indexed value - recored the score made by different authors
   * @generated */
  public void setScoreList(int i, Score v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_scoreList == null)
      jcasType.jcas.throwFeatMissing("scoreList", "model.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_scoreList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_scoreList), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    