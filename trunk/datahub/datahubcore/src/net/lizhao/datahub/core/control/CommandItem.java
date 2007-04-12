package net.lizhao.datahub.core.control;

public abstract class CommandItem implements java.awt.event.ActionListener {
	public abstract void doIt();
	public abstract void unDo();
	public void actionPerformed(java.awt.event.ActionEvent evt) 
	{
		CommandItem cmd = ((CmdMenuItem)evt.getSource()).getCommandItem();
    	cmd.doIt();
    }
	
}
