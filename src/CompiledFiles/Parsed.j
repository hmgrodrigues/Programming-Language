.class public Parser
.super java/lang/Object

;
; standard initializer
.method public <init>()V
   aload_0
   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
       ; set limits used by this method
       .limit locals 4
       .limit stack 256

       ; setup local variables:

       ;    1 - the PrintStream object held in java.lang.System.out
       

       ; place your bytecodes here
       aload_0
       astore_3
       ; START

	new frame_0
	dup
	invokespecial frame_0/<init>()V
	dup
	aload_3
	putfield frame_0/sl Ljava/lang/Object;
	dup
	astore_3
	dup
	new ref_int 
	dup 
	invokespecial ref_int/<init>()V 
	dup
	sipush 5
	putfield ref_int/v I
	putfield frame_0/v0 Lref_int;
	pop
	aload_3
	getfield frame_0/v0 Lref_int;
	checkcast ref_int 
	getfield ref_int/v I
	sipush 3
	isub
	ifgt L3
	sipush 0
	goto L4
	L3:
	sipush 1
	L4:
	ifeq L1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload_3
	getfield frame_0/v0 Lref_int;
	checkcast ref_int 
	getfield ref_int/v I
	invokestatic java/lang/String/valueOf(I)Ljava/lang/String;
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	goto L2
	L1:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload_3
	getfield frame_0/v0 Lref_int;
	checkcast ref_int 
	getfield ref_int/v I
	sipush 1
	isub
	invokestatic java/lang/String/valueOf(I)Ljava/lang/String;
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	L2:
	aload_3
	getfield frame_0/sl Ljava/lang/Object;
	astore_3
	
	; END

       return

.end method
